package androidx.work;

/* JADX INFO: loaded from: classes.dex */
public enum A {
    ENQUEUED,
    RUNNING,
    SUCCEEDED,
    FAILED,
    BLOCKED,
    CANCELLED;

    public boolean d() {
        return this == SUCCEEDED || this == FAILED || this == CANCELLED;
    }
}
