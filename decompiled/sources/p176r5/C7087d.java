package p176r5;

import com.google.android.gms.tasks.Task;

/* JADX INFO: renamed from: r5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7087d extends IllegalStateException {
    private C7087d(String str, Throwable th) {
        super(str, th);
    }

    public static IllegalStateException a(Task task) {
        String strConcat;
        if (!task.n()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception exception = task.getException();
        if (exception != null) {
            strConcat = "failure";
        } else if (task.isSuccessful()) {
            strConcat = "result ".concat(String.valueOf(task.getResult()));
        } else {
            strConcat = task.m() ? "cancellation" : "unknown issue";
        }
        return new C7087d("Complete with: ".concat(strConcat), exception);
    }
}
