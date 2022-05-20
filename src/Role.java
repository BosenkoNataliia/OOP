public class Role {
    private boolean viewAll;
    private boolean editAll;
    private boolean addAll;
    private boolean deleteAll;
    //  public RoleType roleType;

    public Role(boolean viewAll, boolean editAll, boolean addAll, boolean deleteAll) {
        this.viewAll = viewAll;
        this.editAll = editAll;
        this.addAll = addAll;
        this.deleteAll = deleteAll;
    }

    public Role ( RoleType roleType) {
        switch (roleType) {
            case CUSTOMER:
                this.viewAll = true;
                this.editAll = false;
                this.addAll =true;
                this.deleteAll = false;
            case MAINCUSTOMER:
                this.viewAll = true;
                this.editAll = true;
                this.addAll =true;
                this.deleteAll = false;

            case ADMIN:
                this.viewAll = true;
                this.editAll = false;
                this.addAll =true;
                this.deleteAll = false;

            case VIEVER:
                this.viewAll = true;
                this.editAll = false;
                this.addAll =false;
                this.deleteAll = false;

        }
    }


    @Override
    public String toString() {
        return "Role{" +
                "viewAll=" + viewAll +
                ", editAll=" + editAll +
                ", addAll=" + addAll +
                ", deleteAll=" + deleteAll +
                '}';
    }
}
