package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import com.google.android.gms.common.ConnectionResult;
import com.google.protobuf.DescriptorProtos;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AssetManager f10284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f10285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f.c f10286c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final File f10288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f10289f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f10290g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f10291h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c[] f10293j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private byte[] f10294k;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f10292i = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f10287d = d();

    public b(AssetManager assetManager, Executor executor, f.c cVar, String str, String str2, String str3, File file) {
        this.f10284a = assetManager;
        this.f10285b = executor;
        this.f10286c = cVar;
        this.f10289f = str;
        this.f10290g = str2;
        this.f10291h = str3;
        this.f10288e = file;
    }

    private b b(c[] cVarArr, byte[] bArr) {
        try {
            InputStream inputStreamG = g(this.f10284a, this.f10291h);
            if (inputStreamG == null) {
                if (inputStreamG != null) {
                    inputStreamG.close();
                }
                return null;
            }
            try {
                this.f10293j = g.r(inputStreamG, g.p(inputStreamG, g.f10314b), bArr, cVarArr);
                inputStreamG.close();
                return this;
            } catch (Throwable th) {
                try {
                    inputStreamG.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (FileNotFoundException e10) {
            this.f10286c.a(9, e10);
        } catch (IOException e11) {
            this.f10286c.a(7, e11);
        } catch (IllegalStateException e12) {
            this.f10293j = null;
            this.f10286c.a(8, e12);
        }
    }

    private void c() {
        if (!this.f10292i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    private static byte[] d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            return i.f10326a;
        }
        switch (i10) {
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
            case 25:
                return i.f10330e;
            case 26:
                return i.f10329d;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                return i.f10328c;
            case 28:
            case 29:
            case 30:
                return i.f10327b;
            default:
                return null;
        }
    }

    private InputStream f(AssetManager assetManager) {
        try {
            return g(assetManager, this.f10290g);
        } catch (FileNotFoundException e10) {
            this.f10286c.a(6, e10);
            return null;
        } catch (IOException e11) {
            this.f10286c.a(7, e11);
            return null;
        }
    }

    private InputStream g(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f10286c.b(5, null);
            }
            return null;
        }
    }

    private c[] i(InputStream inputStream) {
        try {
            try {
                try {
                    c[] cVarArrX = g.x(inputStream, g.p(inputStream, g.f10313a), this.f10289f);
                    try {
                        inputStream.close();
                        return cVarArrX;
                    } catch (IOException e10) {
                        this.f10286c.a(7, e10);
                        return cVarArrX;
                    }
                } catch (IllegalStateException e11) {
                    this.f10286c.a(8, e11);
                    try {
                        inputStream.close();
                    } catch (IOException e12) {
                        this.f10286c.a(7, e12);
                    }
                    return null;
                }
            } catch (IOException e13) {
                this.f10286c.a(7, e13);
                inputStream.close();
                return null;
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e14) {
                this.f10286c.a(7, e14);
            }
            throw th;
        }
    }

    private static boolean j() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 31 || i10 == 24 || i10 == 25;
    }

    private void k(final int i10, final Object obj) {
        this.f10285b.execute(new Runnable() { // from class: v0.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f50092a.f10286c.a(i10, obj);
            }
        });
    }

    public boolean e() {
        if (this.f10287d == null) {
            k(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.f10288e.exists()) {
            try {
                if (!this.f10288e.createNewFile()) {
                    k(4, null);
                    return false;
                }
            } catch (IOException unused) {
                k(4, null);
                return false;
            }
        } else if (!this.f10288e.canWrite()) {
            k(4, null);
            return false;
        }
        this.f10292i = true;
        return true;
    }

    public b h() {
        b bVarB;
        c();
        if (this.f10287d != null) {
            InputStream inputStreamF = f(this.f10284a);
            if (inputStreamF != null) {
                this.f10293j = i(inputStreamF);
            }
            c[] cVarArr = this.f10293j;
            if (cVarArr != null && j() && (bVarB = b(cVarArr, this.f10287d)) != null) {
                return bVarB;
            }
        }
        return this;
    }

    public b l() {
        c[] cVarArr = this.f10293j;
        byte[] bArr = this.f10287d;
        if (cVarArr != null && bArr != null) {
            c();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    g.F(byteArrayOutputStream, bArr);
                    if (!g.C(byteArrayOutputStream, bArr, cVarArr)) {
                        this.f10286c.a(5, null);
                        this.f10293j = null;
                        byteArrayOutputStream.close();
                        return this;
                    }
                    this.f10294k = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    this.f10293j = null;
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e10) {
                this.f10286c.a(7, e10);
            } catch (IllegalStateException e11) {
                this.f10286c.a(8, e11);
            }
        }
        return this;
    }

    public boolean m() {
        byte[] bArr = this.f10294k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f10288e);
                    try {
                        FileChannel channel = fileOutputStream.getChannel();
                        try {
                            FileLock fileLockTryLock = channel.tryLock();
                            try {
                                d.l(byteArrayInputStream, fileOutputStream, fileLockTryLock);
                                k(1, null);
                                if (fileLockTryLock != null) {
                                    fileLockTryLock.close();
                                }
                                channel.close();
                                fileOutputStream.close();
                                byteArrayInputStream.close();
                                this.f10294k = null;
                                this.f10293j = null;
                                return true;
                            } catch (Throwable th) {
                                if (fileLockTryLock != null) {
                                    try {
                                        fileLockTryLock.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            if (channel != null) {
                                try {
                                    channel.close();
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                }
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                    }
                    throw th7;
                }
            } catch (FileNotFoundException e10) {
                k(6, e10);
                this.f10294k = null;
                this.f10293j = null;
                return false;
            } catch (IOException e11) {
                k(7, e11);
                this.f10294k = null;
                this.f10293j = null;
                return false;
            }
        } catch (Throwable th9) {
            this.f10294k = null;
            this.f10293j = null;
            throw th9;
        }
    }
}
