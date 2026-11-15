package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import android.os.StrictMode;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.soloader.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1415c extends G implements w {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayList f16538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected boolean f16539g;

    /* JADX INFO: renamed from: com.facebook.soloader.c$a */
    protected class a extends G.e {
        protected a() {
        }

        @Override // com.facebook.soloader.G.e
        public G.c[] c() {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = C1415c.this.f16538f;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                G.e eVarQ = ((m) obj).q();
                try {
                    arrayList.addAll(Arrays.asList(eVarQ.c()));
                    eVarQ.close();
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
            return (G.c[]) arrayList.toArray(new G.c[arrayList.size()]);
        }

        @Override // com.facebook.soloader.G.e
        public void h(File file) throws IOException {
            ArrayList arrayList = C1415c.this.f16538f;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                m.b bVar = (m.b) ((m) obj).q();
                try {
                    bVar.h(file);
                    bVar.close();
                } catch (Throwable th) {
                    if (bVar != null) {
                        try {
                            bVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
        }
    }

    public C1415c(Context context, String str, boolean z9) {
        super(context, str, z9);
        ArrayList arrayList = new ArrayList();
        this.f16538f = arrayList;
        this.f16539g = false;
        arrayList.add(new m(context, str, new File(context.getApplicationInfo().sourceDir), "^lib/([^/]+)/([^/]+\\.so)$"));
        w(context, str);
    }

    private void w(Context context, String str) {
        if (context.getApplicationInfo().splitSourceDirs == null) {
            return;
        }
        try {
            for (String str2 : context.getApplicationInfo().splitSourceDirs) {
                m mVar = new m(context, str, new File(str2), "^lib/([^/]+)/([^/]+\\.so)$");
                if (mVar.v()) {
                    p.g("BackupSoSource", "adding backup source from split: " + mVar.toString());
                    this.f16538f.add(mVar);
                }
            }
        } catch (IOException e10) {
            p.h("BackupSoSource", "failed to read split apks", e10);
        }
    }

    @Override // com.facebook.soloader.w
    public E b(Context context) {
        C1415c c1415c = new C1415c(context, this.f16547a.getName());
        try {
            c1415c.e(0);
            return c1415c;
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // com.facebook.soloader.C1418f, com.facebook.soloader.E
    public String c() {
        return "BackupSoSource";
    }

    @Override // com.facebook.soloader.C1418f, com.facebook.soloader.E
    public int d(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        if (this.f16539g) {
            return super.d(str, i10, threadPolicy);
        }
        return 0;
    }

    @Override // com.facebook.soloader.G, com.facebook.soloader.E
    public void e(int i10) throws IOException {
        if ((i10 & 8) != 0) {
            return;
        }
        super.e(i10);
        this.f16539g = true;
    }

    @Override // com.facebook.soloader.G
    protected byte[] n() {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeByte((byte) 3);
            parcelObtain.writeInt(SysUtil.g(this.f16510d));
            parcelObtain.writeInt(this.f16538f.size());
            ArrayList arrayList = this.f16538f;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                parcelObtain.writeByteArray(((m) obj).n());
            }
            String str = this.f16510d.getApplicationInfo().sourceDir;
            if (str == null) {
                parcelObtain.writeByte((byte) 1);
                return parcelObtain.marshall();
            }
            File canonicalFile = new File(str).getCanonicalFile();
            if (!canonicalFile.exists()) {
                parcelObtain.writeByte((byte) 1);
                return parcelObtain.marshall();
            }
            parcelObtain.writeByte((byte) 2);
            parcelObtain.writeString(canonicalFile.getPath());
            parcelObtain.writeLong(canonicalFile.lastModified());
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.facebook.soloader.G
    public G.c[] o() {
        G.e eVarQ = ((m) this.f16538f.get(0)).q();
        try {
            G.c[] cVarArrC = eVarQ.c();
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

    @Override // com.facebook.soloader.G
    protected G.e q() {
        return new a();
    }

    @Override // com.facebook.soloader.C1418f, com.facebook.soloader.E
    public String toString() {
        String name;
        try {
            name = String.valueOf(this.f16547a.getCanonicalPath());
        } catch (IOException unused) {
            name = this.f16547a.getName();
        }
        return c() + "[root = " + name + " flags = " + this.f16548b + " apks = " + this.f16538f.toString() + "]";
    }

    public boolean x(String str, int i10) throws IOException {
        boolean z9;
        G.e eVarQ = q();
        try {
            G.c[] cVarArrC = eVarQ.c();
            int length = cVarArrC.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    z9 = false;
                    break;
                }
                if (cVarArrC[i11].f16517a.equals(str)) {
                    p.b("SoLoader", "Found " + str + " in " + c());
                    z9 = true;
                    break;
                }
                i11++;
            }
            eVarQ.close();
            if (!z9) {
                return false;
            }
            p.b("SoLoader", "Preparing " + c());
            e(i10);
            return true;
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

    public C1415c(Context context, String str) {
        this(context, str, true);
    }
}
