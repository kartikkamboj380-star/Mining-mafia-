package com.google.android.gms.internal.ads;

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
abstract class AM0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f17292a;

    static {
        char[] cArr = new char[80];
        f17292a = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String a(InterfaceC5863yM0 interfaceC5863yM0, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        c(interfaceC5863yM0, sb, 0);
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
            sb.append(YM0.a(AbstractC5231tL0.A((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC5231tL0) {
            sb.append(": \"");
            sb.append(YM0.a((AbstractC5231tL0) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof UL0) {
            sb.append(" {");
            c((UL0) obj, sb, i10 + 2);
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
    private static void c(InterfaceC5863yM0 interfaceC5863yM0, StringBuilder sb, int i10) {
        int i11;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = interfaceC5863yM0.getClass().getDeclaredMethods();
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
                b(sb, i10, strSubstring.substring(0, strSubstring.length() - 4), UL0.s(method2, interfaceC5863yM0, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                b(sb, i10, strSubstring.substring(0, strSubstring.length() - 3), UL0.s(method, interfaceC5863yM0, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objS = UL0.s(method4, interfaceC5863yM0, new Object[0]);
                    if (method5 == null) {
                        if (objS instanceof Boolean) {
                            if (((Boolean) objS).booleanValue()) {
                                b(sb, i10, strSubstring, objS);
                            }
                        } else if (objS instanceof Integer) {
                            if (((Integer) objS).intValue() != 0) {
                                b(sb, i10, strSubstring, objS);
                            }
                        } else if (objS instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objS).floatValue()) != 0) {
                                b(sb, i10, strSubstring, objS);
                            }
                        } else if (!(objS instanceof Double)) {
                            if (objS instanceof String) {
                                zEquals = objS.equals("");
                            } else if (objS instanceof AbstractC5231tL0) {
                                zEquals = objS.equals(AbstractC5231tL0.f33386b);
                            } else if (objS instanceof InterfaceC5863yM0) {
                                if (objS != ((InterfaceC5863yM0) objS).f()) {
                                    b(sb, i10, strSubstring, objS);
                                }
                            } else if (!(objS instanceof Enum) || ((Enum) objS).ordinal() != 0) {
                                b(sb, i10, strSubstring, objS);
                            }
                            if (!zEquals) {
                                b(sb, i10, strSubstring, objS);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objS).doubleValue()) != 0) {
                            b(sb, i10, strSubstring, objS);
                        }
                    } else if (((Boolean) UL0.s(method5, interfaceC5863yM0, new Object[0])).booleanValue()) {
                        b(sb, i10, strSubstring, objS);
                    }
                }
            }
            i11 = 3;
        }
        C2972bN0 c2972bN0 = ((UL0) interfaceC5863yM0).zzt;
        if (c2972bN0 != null) {
            c2972bN0.i(sb, i10);
        }
    }

    private static void d(int i10, StringBuilder sb) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb.append(f17292a, 0, i11);
            i10 -= i11;
        }
    }
}
