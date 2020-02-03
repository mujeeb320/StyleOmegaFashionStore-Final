package com.example.styleomegafashionstore.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.styleomegafashionstore.R;
import com.example.styleomegafashionstore.interfaces.ItemClickListener;

public class CartVIewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView textproductName, textproductPrice, textproductQuantity;

    private ItemClickListener itemClickListener;

    public CartVIewHolder(@NonNull View itemView) {
        super(itemView);

        textproductName = itemView.findViewById(R.id.cart_product_name);
        textproductPrice= itemView.findViewById(R.id.cart_product_price);
        textproductQuantity= itemView.findViewById(R.id.cart_product_quantity);


    }

    @Override
    public void onClick(View v)
    {
        itemClickListener.OnClick(v, getAdapterPosition(), false);


    }
}
