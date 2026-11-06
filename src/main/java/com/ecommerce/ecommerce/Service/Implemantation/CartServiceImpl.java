package com.ecommerce.ecommerce.Service.Implemantation;

import com.ecommerce.ecommerce.DTO.CartDto;
import com.ecommerce.ecommerce.DTO.CartItemDto;
import com.ecommerce.ecommerce.Model.Cart;
import com.ecommerce.ecommerce.Model.CartItem;
import com.ecommerce.ecommerce.Model.User;
import com.ecommerce.ecommerce.Repository.CartItemRepository;
import com.ecommerce.ecommerce.Repository.CartRepository;
import com.ecommerce.ecommerce.Repository.UserRepository;
import com.ecommerce.ecommerce.Service.CartService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CartServiceImpl implements CartService {
    private final CartRepository cartRepository;
    private final CartItemRepository cartItemRepository;
    private final UserRepository userRepository;

    public CartServiceImpl(CartRepository cartRepository, CartItemRepository cartItemRepository, UserRepository userRepository) {
        this.cartRepository = cartRepository;
        this.cartItemRepository = cartItemRepository;
        this.userRepository = userRepository;
    }

    // convert cartitem to dto to put it into cartdto
    private CartItemDto convertCartItemToDto(CartItem item) {

        CartItemDto dto = new CartItemDto();

        dto.setId(item.getId());
        dto.setQuantity(item.getQuantity());

        if (item.getProduct() != null) {
            dto.setProductId(item.getProduct().getId());
            dto.setProductName(item.getProduct().getName());
            dto.setPrice(item.getProduct().getPrice());

            dto.setSubtotal(
                    item.getProduct().getPrice()
                            .multiply(BigDecimal.valueOf(item.getQuantity()))
            );
        }

        return dto;
    }


    private CartDto convertToDto(Cart cart) {

        CartDto dto = new CartDto();

        dto.setId(cart.getId());

        if (cart.getUser() != null) {
            dto.setUserId(cart.getUser().getId());
        }

        dto.setCartItems(
                cart.getCartItems().stream()
                        .map(this::convertCartItemToDto)
                        .collect(Collectors.toList())
        );

        BigDecimal totalPrice = dto.getCartItems().stream()
                .map(CartItemDto::getSubtotal)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        dto.setTotalPrice(totalPrice);

        return dto;
    }

    private Cart convertToEntity(CartDto dto) {

        Cart cart = new Cart();

        User user = userRepository.findById(dto.getUserId())
                .orElseThrow(() -> new RuntimeException("User not found"));

        cart.setUser(user);

        return cart;
    }


    @Override
    public List<CartDto> getAllCarts() {
        return cartRepository.findAll().stream().map(this::convertToDto).collect(Collectors.toList());
    }

    @Override
    public CartDto getCartById(Long id) {
        return cartRepository.findById(id)
                .map(this::convertToDto)
                .orElseThrow(()-> new RuntimeException("cart not found"));
    }

    @Override
    public CartDto addCart(CartDto cartDto) {
        Cart cart = convertToEntity(cartDto);
        return convertToDto(cartRepository.save(cart));
    }

    @Override
    public CartDto updateCart(Long id, CartDto cartDto) {
        Cart cart = cartRepository.findById(id).orElseThrow(()->new RuntimeException("cart no found"));

        Cart updatedcart = convertToEntity(cartDto);

        return null;
    }

    @Override
    public void deleteCart(Long id) {
        cartRepository.deleteById(id);
    }
}
