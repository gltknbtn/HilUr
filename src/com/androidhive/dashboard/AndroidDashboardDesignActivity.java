package com.androidhive.dashboard;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidhive.dashboard.R;

public class AndroidDashboardDesignActivity extends Activity {
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_layout);
        
        /**
         * Creating all buttons instances
         * */
        // Dashboard restaurantd button
        Button btn_restauranstAndProducts = (Button) findViewById(R.id.btn_restauranstAndProducts);
        
        // Dashboard Header textview
        final TextView tvHeader = (TextView) findViewById(R.id.tvHeader);
        tvHeader.setText("HÝLELÝ ÜRÜNLER");
        
        // Dashboard supported products button
        Button btn_suppportedProducts = (Button) findViewById(R.id.btn_suppportedProducts);
        
        // Dashboard products button
        Button btn_products = (Button) findViewById(R.id.btn_products);
        
        /**
         * Handling all button click events
         * */
        
        btn_restauranstAndProducts.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				Intent i = new Intent(getApplicationContext(), RestaurantsActivity.class);
				startActivity(i);
				overridePendingTransition(R.anim.fadein, R.anim.fadeout);
			}
		});
        
        btn_suppportedProducts.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				Intent i = new Intent(getApplicationContext(), SupportedProductsActivity.class);
				startActivity(i);
				overridePendingTransition(R.anim.fadein, R.anim.fadeout);
			}
		});
        
        btn_products.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				Intent i = new Intent(getApplicationContext(), ProductsActivity.class);
				startActivity(i);
				overridePendingTransition(R.anim.fadein, R.anim.fadeout);
			}
		});
        
    }
    
    @Override
    public void onBackPressed() {
    	exitByBackKey();
    }
    
    protected void exitByBackKey() {

		AlertDialog alertbox = new AlertDialog.Builder(this).setMessage("Uygulamadan çýkmak istediðinizden emin misiniz?")
				.setPositiveButton("Evet", new DialogInterface.OnClickListener() {

					// do something when the button is clicked
					public void onClick(DialogInterface arg0, int arg1) {
						finish();
						// close();

					}
				}).setNegativeButton("Hayýr", new DialogInterface.OnClickListener() {

					// do something when the button is clicked
					public void onClick(DialogInterface arg0, int arg1) {
					}
				}).show();

	}
}