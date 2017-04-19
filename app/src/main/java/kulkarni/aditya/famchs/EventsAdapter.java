package kulkarni.aditya.famchs;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;


public class EventsAdapter extends RecyclerView.Adapter<EventsAdapter.ViewHolder> {

    private ArrayList<Events> events;

    public EventsAdapter(ArrayList<Events> eventsArrayList) {
        this.events = eventsArrayList;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView title;
        TextView description;
        TextView created_at;
        TextView tags;

        ViewHolder(View itemView) {
            super(itemView);
            cv = (CardView) itemView.findViewById(R.id.event_card_view);
            title = (TextView) itemView.findViewById(R.id.event_card_title);
            description = (TextView) itemView.findViewById(R.id.event_card_description);

        }
    }

    @Override
    public int getItemCount() {
        if(events == null){
            return 0;
        } else {
            return events.size();
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.events_card, viewGroup, false);
        ViewHolder cardHolder = new ViewHolder(v);
        return cardHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.title.setText(events.get(i).getMtitle());
        viewHolder.description.setText(events.get(i).getMdescription());

    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }


}

