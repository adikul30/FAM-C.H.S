package kulkarni.aditya.famchs;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;



public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder> {

    private ArrayList<Contact> mtechnicians;

    public ContactAdapter(ArrayList<Contact> technicians) {
        mtechnicians=technicians;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView occupation;
        TextView name;
        TextView number;

        public ViewHolder(View itemView) {
            super(itemView);
            occupation = (TextView) itemView.findViewById(R.id.occupation);
            name = (TextView) itemView.findViewById(R.id.technician_name);
            number = (TextView) itemView.findViewById(R.id.technician_number);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_list,parent,false);
        return new ViewHolder(v) ;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.occupation.setText(mtechnicians.get(position).getmOccupation());
        holder.name.setText(mtechnicians.get(position).getmName());
        holder.number.setText(mtechnicians.get(position).getmNumber());
    }

    @Override
    public int getItemCount() {
        if(mtechnicians==null){
            return 0;
        }
        else {
            return mtechnicians.size();
        }
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

}

