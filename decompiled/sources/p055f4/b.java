package p055f4;

import android.content.Context;
import com.facebook.soloader.E;
import com.facebook.soloader.p;
import com.facebook.soloader.v;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f43645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f43646b;

    public b(Context context, a aVar) {
        this.f43645a = context;
        this.f43646b = aVar;
    }

    @Override // p055f4.h
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, E[] eArr) {
        String str = this.f43645a.getApplicationInfo().sourceDir;
        if (new File(str).exists()) {
            p.g("soloader.recovery.CheckBaseApkExists", "Base apk exists: " + str);
            return false;
        }
        StringBuilder sb = new StringBuilder("Base apk does not exist: ");
        sb.append(str);
        sb.append(". ");
        this.f43646b.b(sb);
        throw new v(sb.toString(), unsatisfiedLinkError);
    }
}
