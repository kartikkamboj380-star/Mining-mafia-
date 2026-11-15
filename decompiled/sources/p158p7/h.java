package p158p7;

/* JADX INFO: loaded from: classes3.dex */
public enum h {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    LOADED("loaded"),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE("viewable"),
    AUDIBLE("audible"),
    OTHER("other");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47946a;

    h(String str) {
        this.f47946a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f47946a;
    }
}
