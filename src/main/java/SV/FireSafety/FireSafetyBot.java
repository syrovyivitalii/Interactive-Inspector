package SV.FireSafety;

import SV.FireSafety.processors.Processor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
@Component
public class FireSafetyBot extends TelegramLongPollingBot {
    private Processor processor;

    @Override
    public String getBotUsername() {
        return "interactive_inspector_bot";
    }

    @Override
    public String getBotToken() {
        return "5371892313:AAF2xzQ4wp3u_YjGAXI4afta5t1XGuWBLYc";
    }

    @Override
    public void onUpdateReceived(Update update) {
        processor.process(update);
    }
    @Autowired
    public void setProcessor(Processor processor){
        this.processor = processor;
    }
}
