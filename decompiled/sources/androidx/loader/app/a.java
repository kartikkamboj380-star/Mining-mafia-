package androidx.loader.app;

import android.os.Bundle;
import androidx.lifecycle.W;
import androidx.lifecycle.r;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p141o0.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: androidx.loader.app.a$a, reason: collision with other inner class name */
    public interface InterfaceC0162a {
        c a(int i10, Bundle bundle);

        void b(c cVar);

        void c(c cVar, Object obj);
    }

    public static a b(r rVar) {
        return new b(rVar, ((W) rVar).getViewModelStore());
    }

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract c c(int i10, Bundle bundle, InterfaceC0162a interfaceC0162a);

    public abstract void d();
}
