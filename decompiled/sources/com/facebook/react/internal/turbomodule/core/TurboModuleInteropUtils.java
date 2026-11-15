package com.facebook.react.internal.turbomodule.core;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:31)
    */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class TurboModuleInteropUtils {

    @NotNull
    public static final TurboModuleInteropUtils INSTANCE = new TurboModuleInteropUtils();

    @Metadata
    public static final class MethodDescriptor {

        @p024c3.a
        @NotNull
        public final String jniSignature;

        @p024c3.a
        public final int jsArgCount;

        @p024c3.a
        @NotNull
        public final String jsiReturnKind;

        @p024c3.a
        @NotNull
        public final String methodName;

        public MethodDescriptor(@NotNull String methodName, @NotNull String jniSignature, @NotNull String jsiReturnKind, int i10) {
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            Intrinsics.checkNotNullParameter(jniSignature, "jniSignature");
            Intrinsics.checkNotNullParameter(jsiReturnKind, "jsiReturnKind");
            this.methodName = methodName;
            this.jniSignature = jniSignature;
            this.jsiReturnKind = jsiReturnKind;
            this.jsArgCount = i10;
        }
    }

    private TurboModuleInteropUtils() {
    }

    private final String convertClassToJniType(Class<?> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Class must have a canonical name");
        }
        return "L" + StringsKt.E(canonicalName, '.', '/', false, 4, null) + ";";
    }

    private final String convertParamClassToJniType(String str, String str2, Class<?> cls) {
        if (Intrinsics.b(cls, Boolean.TYPE)) {
            return "Z";
        }
        if (Intrinsics.b(cls, Integer.TYPE)) {
            return "I";
        }
        if (Intrinsics.b(cls, Double.TYPE)) {
            return "D";
        }
        if (Intrinsics.b(cls, Float.TYPE)) {
            return "F";
        }
        if (Intrinsics.b(cls, Boolean.class) || Intrinsics.b(cls, Integer.class) || Intrinsics.b(cls, Double.class) || Intrinsics.b(cls, Float.class) || Intrinsics.b(cls, String.class) || Intrinsics.b(cls, Callback.class) || Intrinsics.b(cls, Promise.class) || Intrinsics.b(cls, ReadableMap.class) || Intrinsics.b(cls, ReadableArray.class) || Intrinsics.b(cls, Dynamic.class)) {
            return convertClassToJniType(cls);
        }
        throw new ParsingException(str, str2, "Unable to parse JNI signature. Detected unsupported parameter class: " + cls.getCanonicalName());
    }

    private final String convertReturnClassToJniType(String str, String str2, Class<?> cls) {
        if (Intrinsics.b(cls, Boolean.TYPE)) {
            return "Z";
        }
        if (Intrinsics.b(cls, Integer.TYPE)) {
            return "I";
        }
        if (Intrinsics.b(cls, Double.TYPE)) {
            return "D";
        }
        if (Intrinsics.b(cls, Float.TYPE)) {
            return "F";
        }
        if (Intrinsics.b(cls, Void.TYPE)) {
            return "V";
        }
        if (Intrinsics.b(cls, Boolean.class) || Intrinsics.b(cls, Integer.class) || Intrinsics.b(cls, Double.class) || Intrinsics.b(cls, Float.class) || Intrinsics.b(cls, String.class) || Intrinsics.b(cls, WritableMap.class) || Intrinsics.b(cls, WritableArray.class) || Intrinsics.b(cls, Map.class)) {
            return convertClassToJniType(cls);
        }
        throw new ParsingException(str, str2, "Unable to parse JNI signature. Detected unsupported return class: " + cls.getCanonicalName());
    }

    private final String createJSIReturnKind(String str, String str2, Class<?>[] clsArr, Class<?> cls) {
        for (int i10 = 0; i10 < clsArr.length; i10++) {
            if (Intrinsics.b(clsArr[i10], Promise.class)) {
                if (i10 == clsArr.length - 1) {
                    return "PromiseKind";
                }
                throw new ParsingException(str, str2, "Unable to parse JSI return kind. Promises must be used as last parameter only.");
            }
        }
        if (Intrinsics.b(cls, Boolean.TYPE) || Intrinsics.b(cls, Boolean.class)) {
            return "BooleanKind";
        }
        if (Intrinsics.b(cls, Double.TYPE) || Intrinsics.b(cls, Double.class) || Intrinsics.b(cls, Float.TYPE) || Intrinsics.b(cls, Float.class) || Intrinsics.b(cls, Integer.TYPE) || Intrinsics.b(cls, Integer.class)) {
            return "NumberKind";
        }
        if (Intrinsics.b(cls, String.class)) {
            return "StringKind";
        }
        if (Intrinsics.b(cls, Void.TYPE)) {
            return "VoidKind";
        }
        if (Intrinsics.b(cls, WritableMap.class) || Intrinsics.b(cls, Map.class)) {
            return "ObjectKind";
        }
        if (Intrinsics.b(cls, WritableArray.class)) {
            return "ArrayKind";
        }
        throw new ParsingException(str, str2, "Unable to parse JSI return kind. Detected unsupported return class: " + cls.getCanonicalName());
    }

    private final String createJniSignature(String str, String str2, Class<?>[] clsArr, Class<?> cls) {
        StringBuilder sb = new StringBuilder("(");
        for (Class<?> cls2 : clsArr) {
            sb.append(convertParamClassToJniType(str, str2, cls2));
        }
        sb.append(")");
        sb.append(convertReturnClassToJniType(str, str2, cls));
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private final int getJsArgCount(String str, String str2, Class<?>[] clsArr) {
        for (int i10 = 0; i10 < clsArr.length; i10++) {
            if (Intrinsics.b(clsArr[i10], Promise.class)) {
                if (i10 == clsArr.length - 1) {
                    return clsArr.length - 1;
                }
                throw new ParsingException(str, str2, "Unable to parse JavaScript arg count. Promises must be used as last parameter only.");
            }
        }
        return clsArr.length;
    }

    @NotNull
    public static final List<MethodDescriptor> getMethodDescriptorsFromModule(@NotNull NativeModule module) {
        Intrinsics.checkNotNullParameter(module, "module");
        Method[] methodsFromModule = INSTANCE.getMethodsFromModule(module);
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (Method method : methodsFromModule) {
            ReactMethod reactMethod = (ReactMethod) method.getAnnotation(ReactMethod.class);
            String name = module.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            String name2 = method.getName();
            if (reactMethod != null || Intrinsics.b("getConstants", name2)) {
                if (hashSet.contains(name2)) {
                    throw new ParsingException(name, "Module exports two methods to JavaScript with the same name: \"" + name2);
                }
                Intrinsics.c(name2);
                hashSet.add(name2);
                Class<?>[] parameterTypes = method.getParameterTypes();
                Class<?> returnType = method.getReturnType();
                if (Intrinsics.b("getConstants", name2)) {
                    if (!Intrinsics.b(returnType, Map.class)) {
                        throw new ParsingException(name, "getConstants must return a Map");
                    }
                } else if (reactMethod != null) {
                    boolean zIsBlockingSynchronousMethod = reactMethod.isBlockingSynchronousMethod();
                    Class cls = Void.TYPE;
                    if ((zIsBlockingSynchronousMethod && Intrinsics.b(returnType, cls)) || (!reactMethod.isBlockingSynchronousMethod() && !Intrinsics.b(returnType, cls))) {
                        throw new ParsingException(name, "TurboModule system assumes returnType == void iff the method is synchronous.");
                    }
                }
                TurboModuleInteropUtils turboModuleInteropUtils = INSTANCE;
                Intrinsics.c(parameterTypes);
                Intrinsics.c(returnType);
                arrayList.add(new MethodDescriptor(name2, turboModuleInteropUtils.createJniSignature(name, name2, parameterTypes, returnType), turboModuleInteropUtils.createJSIReturnKind(name, name2, parameterTypes, returnType), turboModuleInteropUtils.getJsArgCount(name, name2, parameterTypes)));
            }
        }
        return arrayList;
    }

    private final Method[] getMethodsFromModule(NativeModule nativeModule) {
        Class<?> cls = nativeModule.getClass();
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass == null) {
            superclass = null;
        }
        if (superclass != null && TurboModule.class.isAssignableFrom(superclass)) {
            cls = superclass;
        }
        Method[] declaredMethods = cls.getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
        return declaredMethods;
    }

    @Metadata
    private static final class ParsingException extends RuntimeException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ParsingException(@NotNull String moduleName, @NotNull String message) {
            super("Unable to parse @ReactMethod annotations from native module: " + moduleName + ". Details: " + message);
            Intrinsics.checkNotNullParameter(moduleName, "moduleName");
            Intrinsics.checkNotNullParameter(message, "message");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ParsingException(@NotNull String moduleName, @NotNull String methodName, @NotNull String message) {
            super("Unable to parse @ReactMethod annotation from native module method: " + moduleName + "." + methodName + "(). Details: " + message);
            Intrinsics.checkNotNullParameter(moduleName, "moduleName");
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }
}
