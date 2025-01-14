import lombok.Data;

@Data
class DateRangeRequest {
    private String startDate;
    private String endDate;
    private String currency;
}