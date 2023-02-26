package cn.vbisowen.beizhan.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * ThreadPoolExecutor
 *
 * @author tengmu
 * @desc
 * @date 2023/2/26 17:51
 */
public class ThreadPoolExecutorUtils {

    private static final int COUNT_BITS = Integer.SIZE - 3;
    private static final int COUNT_MASK = (1 << COUNT_BITS) - 1;

    private static final int RUNNING    = -1 << COUNT_BITS;
    private static final int SHUTDOWN   =  0 << COUNT_BITS;
    private static final int STOP       =  1 << COUNT_BITS;
    private static final int TIDYING    =  2 << COUNT_BITS;
    private static final int TERMINATED =  3 << COUNT_BITS;




    public static ThreadPoolExecutor createSingleThreadPoolExecutor(){
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        return (ThreadPoolExecutor) executorService;
    }


    public static void main(String[] args){
        ThreadPoolExecutor singleThreadPoolExecutor = createSingleThreadPoolExecutor();
        singleThreadPoolExecutor.execute(()-> System.out.println(1));
    }

}
