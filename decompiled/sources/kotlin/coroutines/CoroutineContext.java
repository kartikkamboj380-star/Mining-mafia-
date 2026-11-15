package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

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
/* JADX INFO: loaded from: classes3.dex */
@Metadata
public interface CoroutineContext {

    @Metadata
    public interface Element extends CoroutineContext {

        public static final class a {
            public static Object a(Element element, Object obj, Function2 operation) {
                Intrinsics.checkNotNullParameter(operation, "operation");
                return operation.invoke(obj, element);
            }

            public static Element b(Element element, b key) {
                Intrinsics.checkNotNullParameter(key, "key");
                if (!Intrinsics.b(element.getKey(), key)) {
                    return null;
                }
                Intrinsics.d(element, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return element;
            }

            public static CoroutineContext c(Element element, b key) {
                Intrinsics.checkNotNullParameter(key, "key");
                return Intrinsics.b(element.getKey(), key) ? e.f45956a : element;
            }

            public static CoroutineContext d(Element element, CoroutineContext context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return a.b(element, context);
            }
        }

        @Override // kotlin.coroutines.CoroutineContext
        Element get(b bVar);

        b getKey();
    }

    public static final class a {
        public static CoroutineContext b(CoroutineContext coroutineContext, CoroutineContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return context == e.f45956a ? coroutineContext : (CoroutineContext) context.fold(coroutineContext, new Function2() { // from class: q8.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CoroutineContext.a.c((CoroutineContext) obj, (CoroutineContext.Element) obj2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static CoroutineContext c(CoroutineContext acc, Element element) {
            Intrinsics.checkNotNullParameter(acc, "acc");
            Intrinsics.checkNotNullParameter(element, "element");
            CoroutineContext coroutineContextMinusKey = acc.minusKey(element.getKey());
            e eVar = e.f45956a;
            if (coroutineContextMinusKey == eVar) {
                return element;
            }
            d.b bVar = d.f45954F;
            d dVar = (d) coroutineContextMinusKey.get(bVar);
            if (dVar == null) {
                return new c(coroutineContextMinusKey, element);
            }
            CoroutineContext coroutineContextMinusKey2 = coroutineContextMinusKey.minusKey(bVar);
            return coroutineContextMinusKey2 == eVar ? new c(element, dVar) : new c(new c(coroutineContextMinusKey2, element), dVar);
        }
    }

    public interface b {
    }

    Object fold(Object obj, Function2 function2);

    Element get(b bVar);

    CoroutineContext minusKey(b bVar);

    CoroutineContext plus(CoroutineContext coroutineContext);
}
