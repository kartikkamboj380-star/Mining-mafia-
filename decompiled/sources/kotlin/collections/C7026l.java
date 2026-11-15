package kotlin.collections;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: kotlin.collections.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7026l extends C7025k {
    public static boolean c(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr == null || objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        int length = objArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = objArr[i10];
            Object obj2 = objArr2[i10];
            if (obj != obj2) {
                if (obj == null || obj2 == null) {
                    return false;
                }
                if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                    if (!c((Object[]) obj, (Object[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                    if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                    if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                    if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                    if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                    if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                    if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof p129m8.r) && (obj2 instanceof p129m8.r)) {
                    if (!p149o8.a.c(((p129m8.r) obj).a(), ((p129m8.r) obj2).a())) {
                        return false;
                    }
                } else if ((obj instanceof p129m8.w) && (obj2 instanceof p129m8.w)) {
                    if (!p149o8.a.a(((p129m8.w) obj).a(), ((p129m8.w) obj2).a())) {
                        return false;
                    }
                } else if ((obj instanceof p129m8.s) && (obj2 instanceof p129m8.s)) {
                    if (!p149o8.a.b(((p129m8.s) obj).a(), ((p129m8.s) obj2).a())) {
                        return false;
                    }
                } else if ((obj instanceof p129m8.t) && (obj2 instanceof p129m8.t)) {
                    if (!p149o8.a.d(((p129m8.t) obj).a(), ((p129m8.t) obj2).a())) {
                        return false;
                    }
                } else if (!Intrinsics.b(obj, obj2)) {
                    return false;
                }
            }
        }
        return true;
    }
}
