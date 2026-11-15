package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.common.api.Api;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class G extends C1418f implements InterfaceC1414b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final Context f16510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String[] f16511e;

    class a implements FilenameFilter {
        a() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return (str.equals("dso_state") || str.equals("dso_lock") || str.equals("dso_deps")) ? false : true;
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f16513a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ File f16514b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n f16515c;

        b(boolean z9, File file, n nVar) {
            this.f16513a = z9;
            this.f16514b = file;
            this.f16515c = nVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.f("fb-UnpackingSoSource", "starting syncer worker");
            try {
                try {
                    if (this.f16513a) {
                        SysUtil.f(G.this.f16547a);
                    }
                    G.u(this.f16514b, (byte) 1, this.f16513a);
                } finally {
                    p.f("fb-UnpackingSoSource", "releasing dso store lock for " + G.this.f16547a + " (from syncer thread)");
                    this.f16515c.close();
                }
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f16517a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f16518b;

        public c(String str, String str2) {
            this.f16517a = str;
            this.f16518b = str2;
        }
    }

    protected static final class d implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f16519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InputStream f16520b;

        public d(c cVar, InputStream inputStream) {
            this.f16519a = cVar;
            this.f16520b = inputStream;
        }

        public int available() {
            return this.f16520b.available();
        }

        public c c() {
            return this.f16519a;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f16520b.close();
        }
    }

    protected static abstract class e implements Closeable {
        protected e() {
        }

        public void a(d dVar, byte[] bArr, File file) {
            p.d("fb-UnpackingSoSource", "extracting DSO " + dVar.c().f16517a);
            File file2 = new File(file, dVar.c().f16517a);
            try {
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
                    try {
                        int iAvailable = dVar.available();
                        if (iAvailable > 1) {
                            SysUtil.d(randomAccessFile.getFD(), iAvailable);
                        }
                        SysUtil.a(randomAccessFile, dVar.f16520b, Api.BaseClientBuilder.API_PRIORITY_OTHER, bArr);
                        randomAccessFile.setLength(randomAccessFile.getFilePointer());
                        if (!file2.setExecutable(true, false)) {
                            throw new IOException("cannot make file executable: " + file2);
                        }
                        randomAccessFile.close();
                        if (!file2.exists() || file2.setWritable(false)) {
                            return;
                        }
                        p.b("SoLoader", "Error removing " + file2 + " write permission from directory " + file + " (writable: " + file.canWrite() + ")");
                    } catch (Throwable th) {
                        try {
                            randomAccessFile.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (IOException e10) {
                    p.b("fb-UnpackingSoSource", "error extracting dso  " + file2 + " due to: " + e10);
                    SysUtil.c(file2);
                    throw e10;
                }
            } catch (Throwable th3) {
                if (file2.exists() && !file2.setWritable(false)) {
                    p.b("SoLoader", "Error removing " + file2 + " write permission from directory " + file + " (writable: " + file.canWrite() + ")");
                }
                throw th3;
            }
        }

        public abstract c[] c();

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        public abstract void h(File file);
    }

    protected G(Context context, String str, boolean z9) {
        super(p(context, str), z9 ? 1 : 0);
        this.f16510d = context;
    }

    private void j() throws IOException {
        File[] fileArrListFiles = this.f16547a.listFiles(new a());
        if (fileArrListFiles == null) {
            throw new IOException("unable to list directory " + this.f16547a);
        }
        for (File file : fileArrListFiles) {
            p.f("fb-UnpackingSoSource", "Deleting " + file);
            SysUtil.c(file);
        }
    }

    private static boolean m(int i10) {
        return (i10 & 2) != 0;
    }

    public static File p(Context context, String str) {
        return new File(context.getApplicationInfo().dataDir + "/" + str);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0073  */
    private boolean r(n nVar, int i10) throws IOException {
        byte b10;
        File file = new File(this.f16547a, "dso_state");
        byte[] bArrN = n();
        if (m(i10) || k(bArrN)) {
            b10 = 0;
        } else {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                if (randomAccessFile.length() == 1) {
                    try {
                        b10 = randomAccessFile.readByte();
                        if (b10 == 1) {
                            p.f("fb-UnpackingSoSource", "dso store " + this.f16547a + " regeneration not needed: state file clean");
                        } else {
                            b10 = 0;
                        }
                    } catch (IOException e10) {
                        p.f("fb-UnpackingSoSource", "dso store " + this.f16547a + " regeneration interrupted: " + e10.getMessage());
                    }
                } else {
                    b10 = 0;
                }
                randomAccessFile.close();
            } catch (Throwable th) {
                try {
                    randomAccessFile.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (b10 == 1) {
            return false;
        }
        boolean z9 = (i10 & 4) == 0;
        p.f("fb-UnpackingSoSource", "so store dirty: regenerating");
        u(file, (byte) 0, z9);
        j();
        e eVarQ = q();
        try {
            eVarQ.h(this.f16547a);
            eVarQ.close();
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(new File(this.f16547a, "dso_deps"), "rw");
            try {
                randomAccessFile2.write(bArrN);
                randomAccessFile2.setLength(randomAccessFile2.getFilePointer());
                randomAccessFile2.close();
                b bVar = new b(z9, file, nVar);
                if (s(i10)) {
                    new Thread(bVar, "SoSync:" + this.f16547a.getName()).start();
                } else {
                    bVar.run();
                }
                return true;
            } catch (Throwable th3) {
                try {
                    randomAccessFile2.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            if (eVarQ != null) {
                try {
                    eVarQ.close();
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                }
            }
            throw th5;
        }
    }

    private static boolean s(int i10) {
        return (i10 & 1) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void u(File file, byte b10, boolean z9) throws IOException {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.seek(0L);
                randomAccessFile.write(b10);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                if (z9) {
                    randomAccessFile.getFD().sync();
                }
                randomAccessFile.close();
            } catch (Throwable th) {
                try {
                    randomAccessFile.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (SyncFailedException e10) {
            p.h("fb-UnpackingSoSource", "state file sync failed", e10);
        }
    }

    @Override // com.facebook.soloader.InterfaceC1414b
    public void a() throws Throwable {
        try {
            n nVarI = SysUtil.i(this.f16547a, new File(this.f16547a, "dso_lock"));
            if (nVarI != null) {
                nVarI.close();
            }
        } catch (Exception e10) {
            p.c("fb-UnpackingSoSource", "Encountered exception during wait for unpacking trying to acquire file lock for " + getClass().getName() + " (" + this.f16547a + "): ", e10);
        }
    }

    @Override // com.facebook.soloader.E
    public void e(int i10) throws IOException {
        SysUtil.m(this.f16547a);
        if (!this.f16547a.canWrite() && !this.f16547a.setWritable(true)) {
            throw new IOException("error adding " + this.f16547a.getCanonicalPath() + " write permission");
        }
        n nVar = null;
        try {
            try {
                n nVarI = SysUtil.i(this.f16547a, new File(this.f16547a, "dso_lock"));
                try {
                    p.f("fb-UnpackingSoSource", "locked dso store " + this.f16547a);
                    if (!this.f16547a.canWrite() && !this.f16547a.setWritable(true)) {
                        throw new IOException("error adding " + this.f16547a.getCanonicalPath() + " write permission");
                    }
                    if (!r(nVarI, i10)) {
                        p.d("fb-UnpackingSoSource", "dso store is up-to-date: " + this.f16547a);
                        nVar = nVarI;
                    }
                    if (nVar != null) {
                        p.f("fb-UnpackingSoSource", "releasing dso store lock for " + this.f16547a);
                        nVar.close();
                    } else {
                        p.f("fb-UnpackingSoSource", "not releasing dso store lock for " + this.f16547a + " (syncer thread started)");
                    }
                    if (!this.f16547a.canWrite() || this.f16547a.setWritable(false)) {
                        return;
                    }
                    throw new IOException("error removing " + this.f16547a.getCanonicalPath() + " write permission");
                } catch (Throwable th) {
                    th = th;
                    nVar = nVarI;
                    if (nVar != null) {
                        p.f("fb-UnpackingSoSource", "releasing dso store lock for " + this.f16547a);
                        nVar.close();
                    } else {
                        p.f("fb-UnpackingSoSource", "not releasing dso store lock for " + this.f16547a + " (syncer thread started)");
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                if (!this.f16547a.canWrite() || this.f16547a.setWritable(false)) {
                    throw th2;
                }
                throw new IOException("error removing " + this.f16547a.getCanonicalPath() + " write permission");
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    protected boolean k(byte[] bArr) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(new File(this.f16547a, "dso_deps"), "rw");
            try {
                if (randomAccessFile.length() != 0) {
                    int length = (int) randomAccessFile.length();
                    byte[] bArr2 = new byte[length];
                    if (randomAccessFile.read(bArr2) == length) {
                        boolean zL = l(bArr2, bArr);
                        randomAccessFile.close();
                        return zL;
                    }
                    p.f("fb-UnpackingSoSource", "short read of so store deps file: marking unclean");
                }
                randomAccessFile.close();
                return true;
            } catch (Throwable th) {
                try {
                    randomAccessFile.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e10) {
            p.h("fb-UnpackingSoSource", "failed to compare whether deps changed", e10);
            return true;
        }
    }

    protected boolean l(byte[] bArr, byte[] bArr2) {
        return !Arrays.equals(bArr, bArr2);
    }

    protected byte[] n() {
        Parcel parcelObtain = Parcel.obtain();
        e eVarQ = q();
        try {
            c[] cVarArrC = eVarQ.c();
            parcelObtain.writeInt(cVarArrC.length);
            for (c cVar : cVarArrC) {
                parcelObtain.writeString(cVar.f16517a);
                parcelObtain.writeString(cVar.f16518b);
            }
            eVarQ.close();
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            return bArrMarshall;
        } catch (Throwable th) {
            if (eVarQ != null) {
                try {
                    eVarQ.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public c[] o() {
        e eVarQ = q();
        try {
            c[] cVarArrC = eVarQ.c();
            eVarQ.close();
            return cVarArrC;
        } catch (Throwable th) {
            if (eVarQ != null) {
                try {
                    eVarQ.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    protected abstract e q();

    public void t(String[] strArr) {
        this.f16511e = strArr;
    }

    protected G(Context context, String str) {
        this(context, str, true);
    }
}
