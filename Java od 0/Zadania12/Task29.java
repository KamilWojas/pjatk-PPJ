class Task29 {
    private String name;
    private Programmer assignedProgrammer;
    private Designer assignedDesigner;

    public Task29(String name, Programmer programmer, Designer designer) {
        if (programmer != null && designer != null) {
            throw new IllegalArgumentException("Task może być przypisany do Programmer LUB Designer, ale nie do obu jednocześnie (XOR constraint).");
        }

        this.name = name;
        this.assignedProgrammer = programmer;
        this.assignedDesigner = designer;
    }
}