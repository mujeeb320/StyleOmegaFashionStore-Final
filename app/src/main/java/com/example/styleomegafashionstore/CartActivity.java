package com.example.styleomegafashionstore;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.styleomegafashionstore.Prevalent.Prevalent;
import com.example.styleomegafashionstore.ViewHolder.CartVIewHolder;
import com.example.styleomegafashionstore.model.Cart;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class CartActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private Button nxtButton;
    private TextView totalAmountText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        recyclerView=findViewById(R.id.cart_list);
        layoutManager= new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        nxtButton=(Button) findViewById(R.id.next_button);
        totalAmountText= (TextView) findViewById(R.id.Total_Price);

    }

    @Override
    protected void onStart() {
        super.onStart();
        final DatabaseReference cartListRef= FirebaseDatabase.getInstance().getReference().child("Cart List");
        FirebaseRecyclerOptions<Cart> options = new FirebaseRecyclerOptions.Builder<Cart>()
                .setQuery(cartListRef.child("User View")
                        .child(Prevalent.currentOnlineUsers.getPhone())
                        .child("Products"), Cart.class).build();

        FirebaseRecyclerAdapter<Cart, CartVIewHolder > adapter= new FirebaseRecyclerAdapter<Cart, CartVIewHolder>(options) {
            @Override
            protected void onBindViewHolder(@NonNull CartVIewHolder cartVIewHolder, int i, @NonNull Cart cart) {
                cartVIewHolder.textproductName.setText("Name of Product: "+cart.getPname());
                cartVIewHolder.textproductQuantity.setText("Quantity: "+cart.getQuantity());
                cartVIewHolder.textproductPrice.setText("Price: "+cart.getPprice());
            }

            @NonNull
            @Override
            public CartVIewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_items_layout, parent, false);
                CartVIewHolder holder = new CartVIewHolder(view);
                return holder;
            }
        };

        recyclerView.setAdapter(adapter);
        adapter.startListening();

    }
}
