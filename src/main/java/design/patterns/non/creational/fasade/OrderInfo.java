package design.patterns.non.creational.fasade;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class OrderInfo {
    String destination;
    String fromDate;
    String toDate;
    PersonInfo list;
}
