package p249y8;

import F8.c;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.InterfaceC7035e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final Class a(c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Class clsB = ((InterfaceC7035e) cVar).b();
        Intrinsics.d(clsB, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsB;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class b(c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Class clsB = ((InterfaceC7035e) cVar).b();
        if (!clsB.isPrimitive()) {
            Intrinsics.d(clsB, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return clsB;
        }
        String name = clsB.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    clsB = Double.class;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    clsB = Integer.class;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    clsB = Byte.class;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    clsB = Character.class;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    clsB = Long.class;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    clsB = Void.class;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    clsB = Boolean.class;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    clsB = Float.class;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    clsB = Short.class;
                }
                break;
        }
        Intrinsics.d(clsB, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return clsB;
    }

    public static final c c(Class cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return F.b(cls);
    }
}
