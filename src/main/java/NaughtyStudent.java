public class NaughtyStudent extends Student {

    @Override
    public Double getAverageGrade() {
        return super.getAverageGrade()*1.1;
    }
}
