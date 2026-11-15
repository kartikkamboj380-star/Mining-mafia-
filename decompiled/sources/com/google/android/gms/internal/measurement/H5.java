package com.google.android.gms.internal.measurement;

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
abstract class H5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f36287a;

    static {
        char[] cArr = new char[80];
        f36287a = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String a(F5 f10, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        c(f10, sb, 0);
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
        d(i10, sb);
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
            K4 k10 = K4.f36323b;
            sb.append(Z5.a(new J4(((String) obj).getBytes(AbstractC6268m5.f36751a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof K4) {
            sb.append(": \"");
            sb.append(Z5.a((K4) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC6205f5) {
            sb.append(" {");
            c((AbstractC6205f5) obj, sb, i10 + 2);
            sb.append("\n");
            d(i10, sb);
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
        d(i10, sb);
        sb.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01fa  */
    private static void c(F5 f10, StringBuilder sb, int i10) {
        int i11;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = f10.getClass().getDeclaredMethods();
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
                b(sb, i10, strSubstring.substring(0, strSubstring.length() - 4), AbstractC6205f5.u(method2, f10, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                b(sb, i10, strSubstring.substring(0, strSubstring.length() - 3), AbstractC6205f5.u(method, f10, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objU = AbstractC6205f5.u(method4, f10, new Object[0]);
                    if (method5 == null) {
                        if (objU instanceof Boolean) {
                            if (((Boolean) objU).booleanValue()) {
                                b(sb, i10, strSubstring, objU);
                            }
                        } else if (objU instanceof Integer) {
                            if (((Integer) objU).intValue() != 0) {
                                b(sb, i10, strSubstring, objU);
                            }
                        } else if (objU instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objU).floatValue()) != 0) {
                                b(sb, i10, strSubstring, objU);
                            }
                        } else if (!(objU instanceof Double)) {
                            if (objU instanceof String) {
                                zEquals = objU.equals("");
                            } else if (objU instanceof K4) {
                                zEquals = objU.equals(K4.f36323b);
                            } else if (objU instanceof F5) {
                                if (objU != ((F5) objU).e()) {
                                    b(sb, i10, strSubstring, objU);
                                }
                            } else if (!(objU instanceof Enum) || ((Enum) objU).ordinal() != 0) {
                                b(sb, i10, strSubstring, objU);
                            }
                            if (!zEquals) {
                                b(sb, i10, strSubstring, objU);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objU).doubleValue()) != 0) {
                            b(sb, i10, strSubstring, objU);
                        }
                    } else if (((Boolean) AbstractC6205f5.u(method5, f10, new Object[0])).booleanValue()) {
                        b(sb, i10, strSubstring, objU);
                    }
                }
            }
            i11 = 3;
        }
        C6179c6 c6179c6 = ((AbstractC6205f5) f10).zzc;
        if (c6179c6 != null) {
            c6179c6.i(sb, i10);
        }
    }

    private static void d(int i10, StringBuilder sb) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb.append(f36287a, 0, i11);
            i10 -= i11;
        }
    }
}
