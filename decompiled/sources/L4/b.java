package L4;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
final class b implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicInteger f3102a = new AtomicInteger(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f3103b;

    b(String str) {
        this.f3103b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f3102a.getAndIncrement();
        int length = String.valueOf(andIncrement).length();
        String str = this.f3103b;
        StringBuilder sb = new StringBuilder(str.length() + 12 + length);
        sb.append("AdWorker(");
        sb.append(str);
        sb.append(") #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
