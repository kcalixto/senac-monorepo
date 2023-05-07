import { TextInput, View } from "react-native"

export default function App() {
  return (
    <View style={styles.container}>
      <>
        <TextInput
          placeholder="Digite seu Nome Completo"
        />
      </>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
    margin: 10,
    borderColor: "red",
    borderWidth: 1,
  }
});