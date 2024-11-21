package Controlador;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.ActionMode;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tareaclaudiou2.R;

import java.util.List;

import Modelo.Libros;
import Vista.Detalle;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerHolder> {
    private final AppCompatActivity activity;
    List<Libros> listLibros;
    public RecyclerAdapter(List<Libros> listLibros, AppCompatActivity activity) {
        this.listLibros = listLibros;
        this.activity = activity;
    }
    private androidx.appcompat.view.ActionMode mActionMode;
    private int posicionItem = -1;

    @NonNull
    @Override
    public RecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_item_list,parent, false);
        RecyclerHolder recyclerHolder = new RecyclerHolder(view);

        return recyclerHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerHolder holder, int position) {
        Libros libros = listLibros.get(position);
        holder.txtViewSinopsis.setText(libros.getSinopsis());
        holder.txtViewTitulo.setText(libros.getNombre());
        holder.imgLibro.setImageResource(libros.getImagenId());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Detalle.class);
                intent.putExtra("titulo", libros.getNombre());
                intent.putExtra("descripcion", libros.getSinopsis());
                intent.putExtra("imageId", libros.getImagenId());

                v.getContext().startActivity(intent);
            }
        });
        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                boolean res = false;
                if (mActionMode == null) {
                    mActionMode = activity.startSupportActionMode(mActionCallback);
                    posicionItem = holder.getAdapterPosition();
                    res = true;
                }

                return res;
            }



        });
    }

    private ActionMode.Callback mActionCallback = new ActionMode.Callback() {
        @Override
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            mode.getMenuInflater().inflate(R.menu.action_menu, menu);
            mode.setTitle("Menu de Acción");
            return true;
        }

        @Override
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            return false;
        }

        @Override
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
             // Asegúrate de que el ID coincida con el ítem del menú de borrado
                if (posicionItem != -1) {
                    AlertDialog alertDialog = createAlertDialog("Borrado", "¿Esta " +
                            "seguro de que desea borrar este item?");
                    alertDialog.show();



                }


            mode.finish();
            return true;
        }

        public AlertDialog createAlertDialog(String titulo, String mensaje){

            AlertDialog.Builder builder = new AlertDialog.Builder(activity);


            builder.setMessage(mensaje)
                    .setTitle(titulo);

            builder.setPositiveButton("Si", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    listLibros.remove(posicionItem);
                    notifyItemRemoved(posicionItem);
                    notifyItemRangeChanged(posicionItem, listLibros.size());
                    posicionItem = -1;
                }
            });

            builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(activity, "Borrado cancelado", Toast.LENGTH_SHORT).show();
                }
            });
            return builder.create();
        }

        @Override
        public void onDestroyActionMode(ActionMode mode) {
            mActionMode = null;
        }
    };


    @Override
    public int getItemCount() {
        return listLibros.size();
    }
    public class RecyclerHolder extends RecyclerView.ViewHolder {
        ImageView imgLibro;
        TextView txtViewTitulo;
        TextView txtViewSinopsis;


        public RecyclerHolder(@NonNull View itemView) {
            super(itemView);

            imgLibro = (ImageView) itemView.findViewById(R.id.img_item);
            txtViewTitulo = (TextView)  itemView.findViewById(R.id.txt_item_tittle);
            txtViewSinopsis = (TextView)  itemView.findViewById(R.id.txt_item_desc);




        }
    }
}
