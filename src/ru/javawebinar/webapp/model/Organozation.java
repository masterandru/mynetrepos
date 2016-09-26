package ru.javawebinar.webapp.model;

import java.util.Date;
import java.util.List;

/**
 * user
 * 09.09.2016
 */
public class Organozation {
   private Link link;
   private List<Period> periods;

    public Organozation() {

    }

    public Organozation(Link link, List<Period> periods) {
        this.link = link;
        this.periods = periods;
    }

    /**
     * user
     * 11.09.2016
     */
    // Внутренний -> static Если без static то вложенный
    public static class Period {
        private Date startDate;
        private Date endDate;
        private String position;
        private String content;

        public Period() {
        }

        public Period(Date startDate, Date endDate, String position, String content) {
            this.startDate = startDate;
            this.endDate = endDate;
            this.position = position;
            this.content = content;
            //link.hashCode(); // Только если класс Period не static
        }


    }
}


