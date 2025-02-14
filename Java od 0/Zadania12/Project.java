import java.time.LocalDate;
import java.util.Optional;

class Project {
    private Optional<LocalDate> paymentDate = Optional.empty(); // Opcjonalna data płatności

    public void setPaymentDate(LocalDate date) {
        this.paymentDate = Optional.ofNullable(date);
    }