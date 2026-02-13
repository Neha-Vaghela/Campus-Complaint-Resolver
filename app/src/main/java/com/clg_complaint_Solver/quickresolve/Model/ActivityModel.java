package com.clg_complaint_Solver.quickresolve.Model;

public class ActivityModel {

        private String category, time, status, title, description, priority, assignee;

        public ActivityModel(String category, String time, String status, String title,
                             String description, String priority, String assignee) {
            this.category = category;
            this.time = time;
            this.status = status;
            this.title = title;
            this.description = description;
            this.priority = priority;
            this.assignee = assignee;
        }

        // Getters
        public String getCategory() { return category; }
        public String getTime() { return time; }
        public String getStatus() { return status; }
        public String getTitle() { return title; }
        public String getDescription() { return description; }
        public String getPriority() { return priority; }
        public String getAssignee() { return assignee; }

}
