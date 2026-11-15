package T7;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f5787b = "query_info_type";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f5788c = "requester_type_5";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f5789d = "UnityScar";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f5790a;

    public a(String str) {
        this.f5790a = f5789d + str;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString(f5787b, f5788c);
        return bundle;
    }

    public String b() {
        return this.f5790a;
    }
}
