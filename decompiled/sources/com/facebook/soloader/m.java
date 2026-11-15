package com.facebook.soloader;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes2.dex */
public class m extends G {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final File f16562f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final String f16563g;

    protected static final class a extends G.c implements Comparable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ZipEntry f16564c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f16565d;

        a(String str, ZipEntry zipEntry, int i10) {
            super(str, String.valueOf(zipEntry.getCrc()));
            this.f16564c = zipEntry;
            this.f16565d = i10;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return this.f16517a.compareTo(aVar.f16517a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f16564c.equals(aVar.f16564c) && this.f16565d == aVar.f16565d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f16565d * 31) + this.f16564c.hashCode();
        }
    }

    protected class b extends G.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected a[] f16566a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ZipFile f16567b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final G f16568c;

        b(G g10) {
            this.f16567b = new ZipFile(m.this.f16562f);
            this.f16568c = g10;
        }

        @Override // com.facebook.soloader.G.e
        public final G.c[] c() {
            return n();
        }

        @Override // com.facebook.soloader.G.e, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f16567b.close();
        }

        @Override // com.facebook.soloader.G.e
        public void h(File file) throws IOException {
            byte[] bArr = new byte[32768];
            for (a aVar : n()) {
                InputStream inputStream = this.f16567b.getInputStream(aVar.f16564c);
                try {
                    G.d dVar = new G.d(aVar, inputStream);
                    inputStream = null;
                    try {
                        a(dVar, bArr, file);
                        dVar.close();
                    } catch (Throwable th) {
                        try {
                            dVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th3;
                }
            }
        }

        a[] j() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            HashMap map = new HashMap();
            Pattern patternCompile = Pattern.compile(m.this.f16563g);
            String[] strArrJ = SysUtil.j();
            Enumeration<? extends ZipEntry> enumerationEntries = this.f16567b.entries();
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                Matcher matcher = patternCompile.matcher(zipEntryNextElement.getName());
                if (matcher.matches()) {
                    int iGroupCount = matcher.groupCount();
                    String strGroup = matcher.group(iGroupCount - 1);
                    String strGroup2 = matcher.group(iGroupCount);
                    int iE = SysUtil.e(strArrJ, strGroup);
                    if (iE >= 0) {
                        linkedHashSet.add(strGroup);
                        a aVar = (a) map.get(strGroup2);
                        if (aVar == null || iE < aVar.f16565d) {
                            map.put(strGroup2, new a(strGroup2, zipEntryNextElement, iE));
                        }
                    }
                }
            }
            this.f16568c.t((String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]));
            a[] aVarArr = (a[]) map.values().toArray(new a[map.size()]);
            Arrays.sort(aVarArr);
            return aVarArr;
        }

        a[] n() {
            a[] aVarArr = this.f16566a;
            if (aVarArr != null) {
                return aVarArr;
            }
            a[] aVarArrJ = j();
            this.f16566a = aVarArrJ;
            return aVarArrJ;
        }
    }

    public m(Context context, String str, File file, String str2) {
        super(context, str);
        this.f16562f = file;
        this.f16563g = str2;
    }

    @Override // com.facebook.soloader.C1418f, com.facebook.soloader.E
    public String c() {
        return "ExtractFromZipSoSource";
    }

    @Override // com.facebook.soloader.G
    protected G.e q() {
        return new b(this);
    }

    @Override // com.facebook.soloader.C1418f, com.facebook.soloader.E
    public String toString() {
        try {
            return this.f16562f.getCanonicalPath();
        } catch (IOException unused) {
            return this.f16562f.getName();
        }
    }

    public boolean v() throws IOException {
        b bVar = new b(this);
        try {
            boolean z9 = bVar.j().length != 0;
            bVar.close();
            return z9;
        } catch (Throwable th) {
            try {
                bVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
