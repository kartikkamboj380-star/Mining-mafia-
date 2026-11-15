package C0;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0011a f359e = new C0011a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Map f360f = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lock f363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FileChannel f364d;

    /* JADX INFO: renamed from: C0.a$a, reason: collision with other inner class name */
    public static final class C0011a {
        public /* synthetic */ C0011a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Lock b(String str) {
            Lock lock;
            synchronized (a.f360f) {
                try {
                    Map map = a.f360f;
                    Object reentrantLock = map.get(str);
                    if (reentrantLock == null) {
                        reentrantLock = new ReentrantLock();
                        map.put(str, reentrantLock);
                    }
                    lock = (Lock) reentrantLock;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return lock;
        }

        private C0011a() {
        }
    }

    public a(String name, File file, boolean z9) {
        File file2;
        Intrinsics.checkNotNullParameter(name, "name");
        this.f361a = z9;
        if (file != null) {
            file2 = new File(file, name + ".lck");
        } else {
            file2 = null;
        }
        this.f362b = file2;
        this.f363c = f359e.b(name);
    }

    public static /* synthetic */ void c(a aVar, boolean z9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = aVar.f361a;
        }
        aVar.b(z9);
    }

    public final void b(boolean z9) {
        this.f363c.lock();
        if (z9) {
            try {
                File file = this.f362b;
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(this.f362b).getChannel();
                channel.lock();
                this.f364d = channel;
            } catch (IOException e10) {
                this.f364d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e10);
            }
        }
    }

    public final void d() {
        try {
            FileChannel fileChannel = this.f364d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f363c.unlock();
    }
}
