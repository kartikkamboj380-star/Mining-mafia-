package com.facebook.soloader;

import android.content.Context;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends G {

    private final class a extends G.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b[] f16559a;

        /* JADX WARN: Code duplicated, block: B:6:0x004c  */
        a(G g10) throws IOException {
            File file;
            File file2;
            File file3 = new File("/data/local/tmp/exopackage/" + k.this.f16510d.getPackageName() + "/native-libs/");
            ArrayList arrayList = new ArrayList();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            String[] strArrJ = SysUtil.j();
            int length = strArrJ.length;
            int i10 = 0;
            int i11 = 0;
            while (i11 < length) {
                String str = strArrJ[i11];
                File file4 = new File(file3, str);
                if (file4.isDirectory()) {
                    linkedHashSet.add(str);
                    File file5 = new File(file4, "metadata.txt");
                    if (file5.isFile()) {
                        FileReader fileReader = new FileReader(file5);
                        try {
                            BufferedReader bufferedReader = new BufferedReader(fileReader);
                            while (true) {
                                try {
                                    String line = bufferedReader.readLine();
                                    if (line == null) {
                                        file = file3;
                                        bufferedReader.close();
                                        fileReader.close();
                                        break;
                                    }
                                    if (line.length() != 0) {
                                        int iIndexOf = line.indexOf(32);
                                        if (iIndexOf == -1) {
                                            throw new RuntimeException("illegal line in exopackage metadata: [" + line + "]");
                                        }
                                        String str2 = line.substring(i10, iIndexOf) + ".so";
                                        int size = arrayList.size();
                                        while (true) {
                                            if (i10 >= size) {
                                                file2 = file3;
                                                String strSubstring = line.substring(iIndexOf + 1);
                                                arrayList.add(new b(str2, strSubstring.substring(strSubstring.indexOf(45), strSubstring.indexOf(".so")), new File(file4, strSubstring)));
                                                break;
                                            } else {
                                                file2 = file3;
                                                if (((b) arrayList.get(i10)).f16517a.equals(str2)) {
                                                    break;
                                                }
                                                i10++;
                                                file3 = file2;
                                            }
                                        }
                                        file3 = file2;
                                        i10 = 0;
                                    }
                                } catch (Throwable th) {
                                    try {
                                        bufferedReader.close();
                                        throw th;
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                        throw th;
                                    }
                                }
                                try {
                                    fileReader.close();
                                    throw th;
                                } catch (Throwable th3) {
                                    th.addSuppressed(th3);
                                    throw th;
                                }
                            }
                        } catch (Throwable th4) {
                            fileReader.close();
                            throw th4;
                        }
                    }
                    file = file3;
                } else {
                    file = file3;
                }
                i11++;
                file3 = file;
                i10 = 0;
            }
            g10.t((String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]));
            this.f16559a = (b[]) arrayList.toArray(new b[arrayList.size()]);
        }

        @Override // com.facebook.soloader.G.e
        public G.c[] c() {
            return this.f16559a;
        }

        @Override // com.facebook.soloader.G.e
        public void h(File file) throws IOException {
            byte[] bArr = new byte[32768];
            for (b bVar : this.f16559a) {
                FileInputStream fileInputStream = new FileInputStream(bVar.f16561c);
                try {
                    G.d dVar = new G.d(bVar, fileInputStream);
                    fileInputStream = null;
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
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    throw th3;
                }
            }
        }
    }

    private static final class b extends G.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final File f16561c;

        b(String str, String str2, File file) {
            super(str, str2);
            this.f16561c = file;
        }
    }

    public k(Context context, String str) {
        super(context, str);
    }

    @Override // com.facebook.soloader.C1418f, com.facebook.soloader.E
    public String c() {
        return "ExoSoSource";
    }

    @Override // com.facebook.soloader.G
    protected G.e q() {
        return new a(this);
    }
}
