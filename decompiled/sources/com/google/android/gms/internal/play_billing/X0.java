package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
abstract class X0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f37150a;

    static {
        char[] cArr = new char[80];
        f37150a = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String a(V0 v10, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        d(v10, sb, 0);
        return sb.toString();
    }

    static void b(StringBuilder sb, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        c(i10, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i11 = 1; i11 < str.length(); i11++) {
                char cCharAt = str.charAt(i11);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(AbstractC6469v1.a(new N(((String) obj).getBytes(AbstractC6480y0.f37347b))));
            sb.append('\"');
            return;
        }
        if (obj instanceof Q) {
            sb.append(": \"");
            sb.append(AbstractC6469v1.a((Q) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC6445p0) {
            sb.append(" {");
            d((AbstractC6445p0) obj, sb, i10 + 2);
            sb.append("\n");
            c(i10, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i12 = i10 + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        b(sb, i12, "key", entry.getKey());
        b(sb, i12, "value", entry.getValue());
        sb.append("\n");
        c(i10, sb);
        sb.append("}");
    }

    private static void c(int i10, StringBuilder sb) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb.append(f37150a, 0, i11);
            i10 -= i11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01fa  */
    private static void d(V0 v10, StringBuilder sb, int i10) {
        int i11;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = v10.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i12 = 0;
        while (true) {
            i11 = 3;
            if (i12 >= length) {
                break;
            }
            Method method3 = declaredMethods[i12];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i12++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i11);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                b(sb, i10, strSubstring.substring(0, strSubstring.length() - 4), AbstractC6445p0.o(method2, v10, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                b(sb, i10, strSubstring.substring(0, strSubstring.length() - 3), AbstractC6445p0.o(method, v10, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objO = AbstractC6445p0.o(method4, v10, new Object[0]);
                    if (method5 == null) {
                        if (objO instanceof Boolean) {
                            if (((Boolean) objO).booleanValue()) {
                                b(sb, i10, strSubstring, objO);
                            }
                        } else if (objO instanceof Integer) {
                            if (((Integer) objO).intValue() != 0) {
                                b(sb, i10, strSubstring, objO);
                            }
                        } else if (objO instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objO).floatValue()) != 0) {
                                b(sb, i10, strSubstring, objO);
                            }
                        } else if (!(objO instanceof Double)) {
                            if (objO instanceof String) {
                                zEquals = objO.equals("");
                            } else if (objO instanceof Q) {
                                zEquals = objO.equals(Q.f37133b);
                            } else if (objO instanceof V0) {
                                if (objO != ((V0) objO).c()) {
                                    b(sb, i10, strSubstring, objO);
                                }
                            } else if (!(objO instanceof Enum) || ((Enum) objO).ordinal() != 0) {
                                b(sb, i10, strSubstring, objO);
                            }
                            if (!zEquals) {
                                b(sb, i10, strSubstring, objO);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objO).doubleValue()) != 0) {
                            b(sb, i10, strSubstring, objO);
                        }
                    } else if (((Boolean) AbstractC6445p0.o(method5, v10, new Object[0])).booleanValue()) {
                        b(sb, i10, strSubstring, objO);
                    }
                }
            }
            i11 = 3;
        }
        C6481y1 c6481y1 = ((AbstractC6445p0) v10).zzc;
        if (c6481y1 != null) {
            c6481y1.i(sb, i10);
        }
    }
}
