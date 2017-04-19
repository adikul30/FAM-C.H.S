package kulkarni.aditya.famchs;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class PurchaseAdapter extends RecyclerView.Adapter<PurchaseAdapter.ViewHolder> {

    private ArrayList<Purchase> purchases;

    public PurchaseAdapter(ArrayList<Purchase> purchases) {
        this.purchases = purchases;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        CardView cv;
        TextView title;
        TextView description;
        ImageView image;
        TextView contact;

        public ViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)  itemView.findViewById(R.id.purchase_recycler_view);
            title = (TextView) itemView.findViewById(R.id.purchase_title);
            description = (TextView) itemView.findViewById(R.id.purchase_decription);
            image = (ImageView) itemView.findViewById(R.id.purchase_photo);
            contact = (TextView) itemView.findViewById(R.id.purchase_contact);
        }
    }
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.purchase_card, parent, false);
        ViewHolder cardHolder = new ViewHolder(v);
        return cardHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.title.setText(purchases.get(position).getmTitle());
        holder.description.setText(purchases.get(position).getmDescription());
        holder.image.setImageResource(purchases.get(position).getmImage());
        holder.contact.setText(purchases.get(position).getmNumber());
    }

    @Override
    public int getItemCount() {
        if(purchases == null){
            return 0;
        } else {
            return purchases.size();
        }
    }
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

}
