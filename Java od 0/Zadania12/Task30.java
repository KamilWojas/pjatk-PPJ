class CorporateCustomer {
    String nip;
}

class PrivateCustomer {
    String pesel;
}

class Task30 {
    private CorporateCustomer corporateCustomer;
    private PrivateCustomer privateCustomer;

    public Task30(CorporateCustomer corporateCustomer, PrivateCustomer privateCustomer) {
        if (corporateCustomer != null && privateCustomer != null) {
            throw new IllegalArgumentException("Project can have either CorporateCustomer OR PrivateCustomer, not both (XOR constraint)");
        }

        this.corporateCustomer = corporateCustomer;
        this.privateCustomer = privateCustomer;
    }
}