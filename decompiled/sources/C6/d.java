package C6;

/* JADX INFO: loaded from: classes3.dex */
public @interface d {

    public enum a {
        DEFAULT,
        SIGNED,
        FIXED
    }

    a intEncoding() default a.DEFAULT;

    int tag();
}
