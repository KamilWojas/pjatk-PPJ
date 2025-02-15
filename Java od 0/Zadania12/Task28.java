import java.util.Optional;

class Task28 {
    private Optional<Double> finishedTaskBonus = Optional.empty();

    public Task28(Double finishedTaskBonus) {
        this.finishedTaskBonus = Optional.ofNullable(finishedTaskBonus);
    }

    public Optional<Double> getFinishedTaskBonus() {
        return finishedTaskBonus;
    }
}