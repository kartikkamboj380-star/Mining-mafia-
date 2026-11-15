package Z;

import androidx.datastore.preferences.protobuf.AbstractC1123t;

/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f7081a;

    static {
        int[] iArr = new int[AbstractC1123t.d.values().length];
        f7081a = iArr;
        try {
            iArr[AbstractC1123t.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f7081a[AbstractC1123t.d.NEW_BUILDER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f7081a[AbstractC1123t.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f7081a[AbstractC1123t.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f7081a[AbstractC1123t.d.GET_PARSER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f7081a[AbstractC1123t.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f7081a[AbstractC1123t.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
