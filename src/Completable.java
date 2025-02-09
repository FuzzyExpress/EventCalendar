public interface Completable {
    /**
     * Completes the task
     */
    void complete();

    /**
     * @return true if the task is completed, false otherwise
     */
    boolean isCompleted();
    
}
