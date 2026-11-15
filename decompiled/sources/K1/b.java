package K1;

import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class b implements D1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f2524a = "video_reward_full";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f2525b = "video_brand";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f2526c = "video_splash";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f2527d = "video_default";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f2528e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f2529f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f2530g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f2531h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f2532i = null;

    static class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            long jLastModified = file2.lastModified() - file.lastModified();
            if (jLastModified == 0) {
                return 0;
            }
            return jLastModified < 0 ? -1 : 1;
        }
    }

    private static void c(File[] fileArr, int i10, Set set) {
        if (i10 >= 0 && fileArr != null) {
            try {
                if (fileArr.length > i10) {
                    List listAsList = Arrays.asList(fileArr);
                    Collections.sort(listAsList, new a());
                    while (i10 < listAsList.size()) {
                        File file = (File) listAsList.get(i10);
                        if (set != null && !set.contains(file.getAbsolutePath())) {
                            ((File) listAsList.get(i10)).delete();
                        }
                        i10++;
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    private List d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new D1.a(new File(kq()).listFiles(), H1.a.a()));
        arrayList.add(new D1.a(new File(oq()).listFiles(), H1.a.h()));
        arrayList.add(new D1.a(new File(b()).listFiles(), H1.a.c()));
        arrayList.add(new D1.a(new File(bob()).listFiles(), H1.a.b()));
        return arrayList;
    }

    private Set e() {
        HashSet hashSet = new HashSet();
        for (J1.a aVar : J1.a.f1927e.values()) {
            if (aVar != null && aVar.c() != null) {
                com.bykv.vk.openvk.kq.kq.kq.bob.a aVarC = aVar.c();
                hashSet.add(I1.b.d(aVarC.csi(), aVarC.sns()).getAbsolutePath());
                hashSet.add(I1.b.a(aVarC.csi(), aVarC.sns()).getAbsolutePath());
            }
        }
        for (L1.c cVar : L1.a.f3052a.values()) {
            if (cVar != null && cVar.g() != null) {
                com.bykv.vk.openvk.kq.kq.kq.bob.a aVarG = cVar.g();
                hashSet.add(I1.b.d(aVarG.csi(), aVarG.sns()).getAbsolutePath());
                hashSet.add(I1.b.a(aVarG.csi(), aVarG.sns()).getAbsolutePath());
            }
        }
        return hashSet;
    }

    @Override // D1.b
    public long a(com.bykv.vk.openvk.kq.kq.kq.bob.a aVar) {
        if (TextUtils.isEmpty(aVar.csi()) || TextUtils.isEmpty(aVar.sns())) {
            return 0L;
        }
        return I1.b.b(aVar.csi(), aVar.sns());
    }

    public String b() {
        if (this.f2530g == null) {
            this.f2530g = this.f2528e + File.separator + this.f2525b;
            File file = new File(this.f2530g);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.f2530g;
    }

    @Override // D1.b
    public String bob() {
        if (this.f2532i == null) {
            this.f2532i = this.f2528e + File.separator + this.f2527d;
            File file = new File(this.f2532i);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.f2532i;
    }

    @Override // D1.b
    public synchronized void fou() {
        try {
            Set setE = null;
            for (D1.a aVar : d()) {
                File[] fileArrA = aVar.a();
                if (fileArrA != null && fileArrA.length >= aVar.b()) {
                    if (setE == null) {
                        setE = e();
                    }
                    int iB = aVar.b() - 2;
                    if (iB < 0) {
                        iB = 0;
                    }
                    c(aVar.a(), iB, setE);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // D1.b
    public void kq(String str) {
        this.f2528e = str;
    }

    @Override // D1.b
    public String oq() {
        if (this.f2531h == null) {
            this.f2531h = this.f2528e + File.separator + this.f2526c;
            File file = new File(this.f2531h);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.f2531h;
    }

    @Override // D1.b
    public String kq() {
        if (this.f2529f == null) {
            this.f2529f = this.f2528e + File.separator + this.f2524a;
            File file = new File(this.f2529f);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.f2529f;
    }

    @Override // D1.b
    public boolean kq(com.bykv.vk.openvk.kq.kq.kq.bob.a aVar) {
        if (TextUtils.isEmpty(aVar.csi()) || TextUtils.isEmpty(aVar.sns())) {
            return false;
        }
        return new File(aVar.csi(), aVar.sns()).exists();
    }
}
