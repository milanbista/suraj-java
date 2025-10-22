#include "HeavyComputation.h"
#include <jni.h>

extern "C"
JNIEXPORT jdoubleArray JNICALL Java_HeavyComputation_multiplyMatricesNative
  (JNIEnv *env, jobject obj, jdoubleArray a, jdoubleArray b, jint n) {

    // Get pointers to Java arrays with proper casting
    jdouble* pa = const_cast<jdouble*>(reinterpret_cast<const jdouble*>(env->GetPrimitiveArrayCritical(a, nullptr)));
    jdouble* pb = const_cast<jdouble*>(reinterpret_cast<const jdouble*>(env->GetPrimitiveArrayCritical(b, nullptr)));

    jdoubleArray result = env->NewDoubleArray(n * n);
    jdouble* pr = reinterpret_cast<jdouble*>(env->GetPrimitiveArrayCritical(result, nullptr));

    // Matrix multiplication (1D arrays)
    for (int i = 0; i < n; i++)
        for (int j = 0; j < n; j++) {
            double sum = 0.0;
            for (int k = 0; k < n; k++)
                sum += pa[i * n + k] * pb[k * n + j];
            pr[i * n + j] = sum;
        }

    env->ReleasePrimitiveArrayCritical(a, pa, JNI_ABORT);
    env->ReleasePrimitiveArrayCritical(b, pb, JNI_ABORT);
    env->ReleasePrimitiveArrayCritical(result, pr, 0);

    return result;
}

