package com.clg_complaint_Solver.quickresolve.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.clg_complaint_Solver.quickresolve.Model.ActivityModel;
import com.clg_complaint_Solver.quickresolve.R;

import java.util.List;

public class ActivityAdapter extends RecyclerView.Adapter<ActivityAdapter.ViewHolder> {

    private List<ActivityModel> activityList;

    public ActivityAdapter(List<ActivityModel> activityList) {
        this.activityList = activityList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.complaint_list_design, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ActivityModel item = activityList.get(position);

        holder.tvTitle.setText(item.getTitle());
        holder.tvCategory.setText(item.getCategory());
        holder.tvTime.setText(item.getTime());
        holder.tvStatus.setText("● " + item.getStatus());
        holder.tvDescription.setText(item.getDescription());
        holder.tvPriority.setText(item.getPriority());
        holder.tvAssignee.setText(item.getAssignee());
    }

    @Override
    public int getItemCount() {
        return activityList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle, tvCategory, tvTime, tvStatus, tvDescription, tvPriority, tvAssignee;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.title);
            tvCategory = itemView.findViewById(R.id.category);
            tvTime = itemView.findViewById(R.id.timestamp);
            tvStatus = itemView.findViewById(R.id.status);
            tvDescription = itemView.findViewById(R.id.description);
            tvPriority = itemView.findViewById(R.id.priority);
            tvAssignee = itemView.findViewById(R.id.assignee);
        }
    }
}