package p158p7;

import com.unity3d.services.core.device.MimeTypes;

/* JADX INFO: loaded from: classes3.dex */
public enum f {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO(MimeTypes.BASE_TYPE_VIDEO),
    AUDIO(MimeTypes.BASE_TYPE_AUDIO);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47931a;

    f(String str) {
        this.f47931a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f47931a;
    }
}
