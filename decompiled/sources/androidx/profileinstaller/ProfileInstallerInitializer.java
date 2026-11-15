package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.profileinstaller.ProfileInstallerInitializer;
import androidx.profileinstaller.f;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements D0.a {

    private static class a {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public static class b {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(final Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new Runnable() { // from class: v0.e
            @Override // java.lang.Runnable
            public final void run() {
                f.h(context);
            }
        });
    }

    @Override // D0.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public b create(Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: v0.c
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                this.f50098a.e(applicationContext);
            }
        });
        return new b();
    }

    @Override // D0.a
    public List dependencies() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(final Context context) {
        (Build.VERSION.SDK_INT >= 28 ? a.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new Runnable() { // from class: v0.d
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.f(context);
            }
        }, new Random().nextInt(Math.max(1000, 1)) + 5000);
    }
}
