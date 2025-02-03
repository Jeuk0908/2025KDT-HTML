package Travel_system;

public interface GetCitizenInfo {

    abstract String getGender(String name);
    abstract String getCrimeRecord(String name);
    abstract int getPassportNum(String name);
}
