package X6;

import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes3.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final URL f6772a;

    public n(URL url) {
        this.f6772a = url;
    }

    public URLConnection a() {
        return this.f6772a.openConnection();
    }

    public String toString() {
        return this.f6772a.toString();
    }
}
