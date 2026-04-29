package com.hotguy.watchmen.control;

import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hotguy.watchmen.R;

/**
 * Una clase RecyclerView.ViewHolder (simplificando, ViewHolder) es una clase que se encarga
 * de "meter" datos de un objeto de datos del ViewModel en los textview, editText, Webview, etc que tengamos
 * en una row del RecyclerView
 * Si la fila del RV tiene, por ejemplo, 4 views, tres textos y una imagen, como en este caso, tendremos 3 TextView
 * y un WebView como atributos.
 */
public class MoviesSeriesViewHolder extends RecyclerView.ViewHolder {

    private final TextView title;
    private final TextView subtitle;
    private final TextView text;
    private final WebView image;  //Si las imágenes están en la nube (internet), mejor un webview, no usar ImageView

    public MoviesSeriesViewHolder(@NonNull View itemView, MoviesSeriesRVAdapter adapter) {
        super(itemView);

        //El constructor lo que hace es "buscar" los elementos "views" que se necesiten para cada row
        title = itemView.findViewById(R.id.tvTitle);
        subtitle = itemView.findViewById(R.id.tvSubtitle);
        text = itemView.findViewById(R.id.tvMovieText);
        image = itemView.findViewById(R.id.wv_imageView);
    }

    public TextView getTitle() {
        return title;
    }

    public TextView getSubtitle() {
        return subtitle;
    }

    public TextView getText() {
        return text;
    }

    public WebView getImage() {
        return image;
    }
}
