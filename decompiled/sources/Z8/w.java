package Z8;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7212a;

        static {
            int[] iArr = new int[Y8.a.values().length];
            try {
                iArr[Y8.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Y8.a.POLYMORPHIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Y8.a.ALL_JSON_OBJECTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f7212a = iArr;
        }
    }

    public static final String a(V8.d dVar, Y8.b json) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        for (Annotation annotation : dVar.getAnnotations()) {
            if (annotation instanceof Y8.c) {
                return ((Y8.c) annotation).discriminator();
            }
        }
        return json.c().e();
    }
}
