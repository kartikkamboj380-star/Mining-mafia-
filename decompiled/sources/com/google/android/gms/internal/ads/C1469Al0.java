package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.function.Function;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Al0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1469Al0 extends AbstractC5031rl0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ExecutorService f17399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC6039zl0 f17400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Function f17401d;

    public C1469Al0(File file, ExecutorService executorService, InterfaceC6039zl0 interfaceC6039zl0, Function function) {
        super(file);
        this.f17399b = executorService;
        this.f17400c = interfaceC6039zl0;
        this.f17401d = function;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5031rl0
    public final com.google.common.util.concurrent.p b() {
        return AbstractC5685wx0.d(new Callable() { // from class: com.google.android.gms.internal.ads.wl0
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.f34620a.d();
            }
        }, this.f17399b);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5031rl0
    public final com.google.common.util.concurrent.p c(final Object obj) {
        return AbstractC5685wx0.d(new Callable() { // from class: com.google.android.gms.internal.ads.vl0
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.f34164a.e(obj);
                return null;
            }
        }, this.f17399b);
    }

    final /* synthetic */ Object d() {
        Object objZzc;
        Object objB;
        synchronized (this) {
            try {
                try {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(this.f33007a);
                        try {
                            objB = this.f17400c.b(fileInputStream);
                            fileInputStream.close();
                        } catch (Throwable th) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (C5409ul0 e10) {
                        objZzc = this.f17401d.apply(e10);
                        return objZzc;
                    }
                } catch (IOException e11) {
                    objZzc = this.f17401d.apply(new C5409ul0(e11));
                    return objZzc;
                }
            } catch (FileNotFoundException unused) {
                objZzc = this.f17400c.zzc();
                return objZzc;
            }
        }
        return objB;
    }

    final /* synthetic */ Void e(Object obj) {
        synchronized (this) {
            File file = this.f33007a;
            AbstractC3670gw0.b(file);
            String parent = file.getParent();
            String name = file.getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 5);
            sb.append(name);
            sb.append(".temp");
            File file2 = new File(parent, sb.toString());
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    this.f17400c.a(obj, fileOutputStream);
                    fileOutputStream.close();
                    if (!file2.renameTo(this.f33007a)) {
                        throw new IOException("Failed to rename file.");
                    }
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e10) {
                file2.delete();
                throw e10;
            }
        }
        return null;
    }
}
